db.nbd.aggregate([  {   $addFields: {bmi: {$divide: [{"$toDecimal" :"$weight"}, {$multiply: [{ $divide: [{"$toDecimal" :"$height"}, 100] },{ $divide: [{"$toDecimal" :"$height"}, 100] }]}]}}}, {$group: {_id: '$nationality',avarageBmi: { $avg: '$bmi' },highestBmi: { $max: '$bmi' },lowestBmi: { $min: '$bmi' }}}])