
fun main(){
  school("kenyatta", "Mombasa", "Machakos", "Kitui")
 cities()
 digits()

println(places("nakuru","nairobi","kisii"))
 }
 fun school(sch1:String,sch2:String,sch3:String,sch4:String) {
  var schl = arrayOf(sch1, sch2, sch3, sch4)
  println(schl.contentToString())
  digits()
 }
fun cities(){
 var cities= arrayOf("harare", "mumbai", "dodoma", "jakarta")
cities.forEach { city-> println(city.capitalize()) }
}
fun digits(){
 var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
 var sum = (numbers[1]+numbers[4])
 println(sum)
 println(numbers.indexOf(158))
var sortedNum=numbers.sortedArray()
 println(sortedNum.contentToString())

 }
fun places(place1:String,place2:String,place3:String):String{
 var places = arrayOf(place1,place2,place3)
 return places.contentToString()

}