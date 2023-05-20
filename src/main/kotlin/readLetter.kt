fun readLetter(slots: String ="Letra" ) : Char{

    while(true) {                                        //recorreu-se a este while(true) de forma a que quando
        print("${slots}? ")                              //não se escreve nada no readln() não ocorra erro
        val read = readln().uppercase().trim()
        if(read.isNotEmpty())
        return read.first()
    }
}



