
import java.util.*

fun countries() : List<String>{

   val countries = Locale.getAvailableLocales()
        .map { it.displayCountry }
        .filter { it.trim().isNotBlank() && it.length <= 9 }
        .distinct()
        .sorted()

    return countries.toList()
}

