fun main(args: Array<String>) {
    var trainDb : List<Map<String,String>> = listOf(
        mapOf("Name" to "Rajdhathi","Source" to "Surat","Destination" to "Ahmedabad","DepartureTime" to "10:00AM"),
        mapOf("Name" to "Garibrath","Source" to "Surat","Destination" to "Mumbai","DepartureTime" to "11:00AM"),
        mapOf("Name" to "Intercity","Source" to "Surat","Destination" to "Rajasthan","DepartureTime" to "09:00AM"),
        mapOf("Name" to "Tejas","Source" to "Surat","Destination" to "Rajkot","DepartureTime" to "11:09AM")
    )
    val query = args[0]
    val queryTxt = args[1]
    val result = trainDb.filter {
        it.get(query) == queryTxt
    }
    print(result.toString())
}
