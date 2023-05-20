
fun replaceSlots(lc : List<Char>, letter : Char, word : String ) : List<Char>{

  return lc.indices.map{ if(letter == word[it]) letter else lc[it]}

}


