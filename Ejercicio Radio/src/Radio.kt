package radio

class Radio (
        var encendido: Boolean = false,
        var frecuencia: String = "FM",
        var volumen: Int = 0,
        var estacion: Int
) {
    fun encender() {
        encendido = true
    }

    fun apagar() {
        encendido = false
    }

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