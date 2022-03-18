package s23456

String[] words=new File('C:\\Users\\Karolina\\Videos\\semestr 3\\PJP\\zadania\\src\\s23456\\resources\\lista.txt')
def lista= words.sort { a, b -> a.length() <=> b.length() ?: a <=> b }
println lista
