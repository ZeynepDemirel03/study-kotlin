
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
fun main(){
  guess()
  finds()
}
