package radio
fun main(arg: Array<String>){
    class Radio (
        var encendido: Boolean = false,
        var frecuencia: String = "FM",
        var volumen: Int = 0,
        var estacion: Double
) { fun encender() { encendido = true }

    fun apagar() { encendido = false }

    override fun toString(): String {
        return """
            Radio:
                Encendido: $encendido
                Frecuencia: $frecuencia
                Volumen: $volumen
                Estacion: $estacion
        """.trimIndent()
    }
}
    val radio = Radio(estacion= 87.0)
    var opcion: Int=0
    var cambiarVolumen: Int
    var cambiarEstacion: Double
    val menuEncendido: String=("""
        Bienvenido:
        1)Apagar
        2)Subir Volumen
        3)Bajar Volumen
        4)Aumentar Estacion
        5)Disminuir Estacion
        6)Cambiar de FM a AM o viceversa
        *Importante antes de salir recuerde apagar el radio""".trimIndent())
    val menuApagado: String=("""
        Bienvenido:
        1)Encender
        7)Salir""".trimIndent())

    do{
        println(radio)
        println(menuApagado)
        println("Ingrese el numero de la opcion que quiera realizar")
        var opcion= readLine()!!.toInt()
        if (opcion==1){radio.encender()}
        else(println("Esa opcion no esta en el menu"))
        while(radio.encendido==true or  (opcion!=7)) {
        println(radio)
        println(menuEncendido)
        println("Ingrese el numero de la opcion que quiera realizar")
        var opcion= readLine()!!.toInt()
        if(opcion==1){
        radio.apagar() }
        else if(opcion==2) {
            println("Ingrese cuanto quiere aumentarle al volumen")
            cambiarVolumen = readLine()!!.toInt()
            radio.volumen= radio.volumen + cambiarVolumen
            if(radio.volumen>100){
                radio.volumen=100
                println("El volumen ya esta al maximo")}}
        else if(opcion==3) {
            println("Ingrese cuanto quiere disminuirle al volumen")
            cambiarVolumen = readLine()!!.toInt()
            radio.volumen= radio.volumen - cambiarVolumen
            if(radio.volumen<0){
                radio.volumen=0
                println("El volumen ya esta al minimo")
            }}
        else if(opcion==4) {
            println("Ingrese cuanto quiere aumentarle a la estacion")
            cambiarEstacion = readLine()!!.toDouble()
            radio.estacion= radio.estacion + cambiarEstacion
            if(radio.frecuencia=="FM"){if(radio.estacion>100){radio.estacion=87.0}}}
        else if(opcion==5) {
            println("Ingrese cuanto quiere dsminuir a la estacion")
            cambiarEstacion = readLine()!!.toDouble()
            radio.estacion= radio.estacion - cambiarEstacion
            if(radio.frecuencia=="FM"){if(radio.estacion<87){radio.estacion=100.0}}}
        else if(opcion==6) {
            if(radio.frecuencia=="FM" ){
             radio.frecuencia="AM"}
            else{radio.frecuencia= "FM"} }
            else(println("Esa opcion no esta en el menu"))
    }}while(opcion !=7)
}
