
fun main(args: Array<String>) {
    biodata("amrizal")
    hobby("baca","baca apa aja pokoknya...")
}

fun biodata(nama: String, kelas:String = "2A"){
    val biodata = """
        nama = $nama
        kelas = $kelas 
    """
    print(biodata)
}

fun hobby(nama:String, desc:String){ 
    println("hobby = $nama")
    println(desc)

}