package s23456

//def text= 'https://www.fuw.edu.pl/~werner/files/englishWords.txt'.toURL().text
//def list = new URL('https://www.fuw.edu.pl/~werner/files/englishWords.txt').readLines()
//String[] list=new File('C:\\Users\\Karolina\\Videos\\semestr 3\\PJP\\zadania\\src\\s23456\\resources\\lista.txt')
//def word = []
/*
for (item in list) {
    words.add(item.split("").sort().join())
}
def unique=[]
def map = [:]
words.each {
    if(!unique.contains(it)){
        unique.add(it)
        map.put(it,1)
    }
    else
        map.put(it,map[it]+=1)
}
map.each{ key, value->
    if(value>6){
        println " $key "
    }
}*/
def words = new URL('https://www.fuw.edu.pl/~werner/files/englishWords.txt').readLines()
def result = [:]

for (word in words) {
    result[word] = []
    sorted = word.replace("\n", "").split("").sort().join()
    for (each in words){
        sortedEach = each.split("").sort().join()
        if (word == each || word.length() != each.length()){
            continue
        }else if(sorted == sortedEach){
            result[word].add(each)
        }
    }
    if(result[word].size() > 6){
        println(word + ": " + result[word])
    }
}

