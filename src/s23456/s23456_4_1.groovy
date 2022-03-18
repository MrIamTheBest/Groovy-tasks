package s23456

def map = [:]
def unique=[]
def file = new File("C:\\Users\\Karolina\\Videos\\semestr 3\\PJP\\zadania\\src\\s23456\\projekty.txt")
//String[] words=new File("C:\\Users\\Karolina\\Videos\\semestr 3\\PJP\\zadania\\src\\s23456\\projekty.txt")
//file.eachLine {line->
 //   projekt= line.find(/^[a-zA-Z]\w*/)
 //   map.put(line.find(/^[a-zA-Z]\w*/), line.find(/\t\w+( \w+)*\t/))
//}
//println words
//words.each {
    //map.put(it.find(/^[a-zA-Z]\w*/), it.find(/\t\w+( \w+)*\t/))
//}
//println map
//println unique
//File file = new File("projekty.txt")

def projects = []
def programisci = []
def progproj = []

for (each in file){
    projects.add(each.replace("\n", "").split("\t"))
}

File file2 = new File("ProjektyDuze.txt")

for (project in projects){
    if (project.size()-1 > 3){
        file2.write(project[0])
    }
}

File file3 = new File("Programisci.txt")

int x = 0

for (each in projects){
    for(i in 1..each.size()-1){
        if(programisci.contains(each[i])){
            continue
        }else{
            programisci.add(each[i])
            progproj.add([each[i]])
        }
    }
    for(prog in progproj){
        if (each.contains(prog[0])){
            prog.add(each[0])
        }
    }
}

for (prog in progproj){
    file3.append(prog.join("\t")+"\n")
}