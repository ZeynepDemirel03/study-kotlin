
import kotlin.random.Random
  
//bilgisayarin olusturdugu random bir sayiyi tahmin etmece
fun guess(){
    var rastgele = Random.Default
    var sayi = rastgele.nextInt(100)+1
    var tahmin : Int
    var sayac = 0

    while (true){
        println("Tahmininiz:")
        tahmin = readLine()!!.toInt()

        if (tahmin > sayi) {
            println("Sayıyı küçültün")
            sayac++
        } else if (tahmin < sayi) {
            println("Sayıyı büyütün")
            sayac++
        } else {
            println("Tebrikler $sayac denemede sayıyı bildiniz")
            break
        }
    }
}
//girilen üst sınıra kadar olan asal sayıları yazdıran fonksiyon
fun finds() {
    println("üst sınır giriniz")
    val limit = readLine()!!.toInt()
    val list = ArrayList<Int>()

    for (i in 0..limit) {
        if (is_prime(i)) {
            list.add(i)
        }
    }

    println(list)
}

fun is_prime(sayi: Int): Boolean {
    if (sayi < 2) {
        return false
    }

    for (i in 2 until sayi) {
        if (sayi % i == 0) {
            return false
        }
    }
    return true
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    guess()
    finds()
    val list = listOf(1,2,3,4,5)
    println(joins_delimiter(list, "-"))
    println(maksimum(list))
    println(repeats_string("ha",3u))
    val liste = arrayOf(1,2,3,4,5)
    println(prefix(liste))
    val koleksiyon = listOf(8,5,3,5,8,9)
    println(sort_asc(koleksiyon))
    println(sort_dec(koleksiyon))
    println("Temizlenmiş liste: ${removes(koleksiyon)}")
    println("aranan sayının indexi: ${finds_index(koleksiyon,9)}")
    println(right(list,1))
    val harfler = listOf("a", "b", "c", "d", "e", "f")
    println(left(harfler,1))
}

fun <T>joins_delimiter(items: List<T>, delimiter: String): String{
    var result = items[0].toString()
    for (i in 1 until items.size){
        result += delimiter + items[i].toString()
    }
    return result
}

//repeats a string n times
fun repeats_string(s: String, n: UInt): String{
    var result = ""
    var i = 0u
    while (i < n){
        result += s
        i++
    }
    return result
}

//prefix
fun <T>prefix(items: Array<T>): ArrayList<ArrayList<T>> {
    if (items.isEmpty()){
        ArrayList<T>()
    }
    var result = ArrayList<ArrayList<T>>()
    for (i in 1..items.size){
        var list = ArrayList<T>()
        for (i in 0 until i){
            list.add(items[i])
        }
        result.add(list)
    }
    return result
}
//artan şekilde sort
fun sort_asc(items: List<Int>): List<Int> {
    if (items.isEmpty()){
        return items
    }
    var result = items.toMutableList()
    for (i in 0 until result.size){
        for (j in 0 until result.size-1-i){
            if (result[j] < result[j+1]){
                var temp = result[j]
                result[j]=result[j+1]
                result[j+1] = temp
            }
        }
    }
    return result
}
fun sort_dec(items: List<Int>): List<Int> {
    if (items.isEmpty()){
        return items
    }
    var result = items.toMutableList()
    for (i in 0 until result.size){
        for (j in 0 until result.size-1-i){
            if (result[j] > result[j+1]){
                var temp = result[j]
                result[j] = result[j+1]
                result[j+1] = temp
            }
        }
    }
    return result
}
//Remove duplicates
fun removes(items: List<Int>): List<Int>{
    if (items.isEmpty()){
        return items
    }
    var result = mutableListOf<Int>()

    for (i in items.indices){
        var exists = false
        for (j in result.indices){
            if (items[i] == result[j]){
                exists = true
                break
            }
        }
        if (!exists){
            result.add(items[i])
        }
    }
    return result
}
//İstenilen sayının indexini döndüren fonksiyon
fun finds_index(items: List<Int> , value: Int): Int{
    for (i in items.indices){
        if (items[i] == value){
            return i
        }
    }
    return -1
}
//rotate element n times to the right
fun right(items: List<Int>,n: Int): List<Int>{
    if (items.isEmpty()){
        return items
    }

    val result = mutableListOf<Int>()
    val len = items.size
    val rotations = n % len

    for (i in len - rotations until len){
        result.add(items[i])
    }
    for (i in 0 until len - rotations){
        result.add(items[i])
    }
    return result
}
//rotate element n times to the left
fun left(items: List<String>,n: Int): List<String>{
    if (items.isEmpty()){
        return items
    }

    val result = mutableListOf<String>()
    val len = items.size
    val rotations = n % len

    for (i in rotations until len){
        result.add(items[i])
    }
    for (i in 0 until rotations){
        result.add(items[i])
    }
    return result
}
//max
fun maksimum(items: List<Int>): Int{
    var max= items[0]
    for (i in 1..items.size-1){
        if (items[i] > max){
            max = items[i]
        }
    }
    return max
}



