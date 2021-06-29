import requests

outputs = []

def log_response(title, r):
    request_description = f'{title}\n{r}\n{r.headers}\n{r.content}\n\n'
    outputs.append(request_description)

def log_json(title, json):
    outputs.append(f'{title}\n{json}\n\n')

BASE_URL = 'http://localhost:8098/'
DOCUMENT_URL = BASE_URL + 'buckets/s23703/keys/doc1'
source_document = {"name":"mariusz","stamina":21,"3":3.0,"4":1,"extra":420}
source_document = {"a":"g","b":7,"c":8.0,"d":None}
log_response('CREATE DOCUMENT', requests.put(DOCUMENT_URL, json=source_document))

query_response = requests.get(DOCUMENT_URL)
log_response('RETRIEVE DOCUMENT', query_response)

retrieved_document = query_response.json()
log_json('PRINT RETRIEVED DOCUMENT', retrieved_document)

retrieved_document['a'] = 'f'
retrieved_document['b'] = 8

log_response('MODIFY DOCUMENT', requests.put(DOCUMENT_URL, json=retrieved_document))

query_response = requests.get(DOCUMENT_URL)
log_response('RETRIEVE MODIFIED DOCUMENT', query_response)

retrieved_document = query_response.json()
log_json('PRINT RETRIEVED MODIFIED DOCUMENT', retrieved_document)

log_response('DELETE DOCUMENT', requests.delete(DOCUMENT_URL))
log_response('RETRIEVE DELETED DOCUMENT', requests.get(DOCUMENT_URL))

with open('komunikaty.txt', mode='w') as file:
    file.writelines(outputs)
