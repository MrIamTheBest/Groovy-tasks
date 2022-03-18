package s23456

def list = ['12','4','5','7','8','34','67','10']
def temp
//for(out(in list.size()-2)..2){
    0.upto(out){i->
        if(list[i]>list[i+1])
            sort(i,i+1)
    }
//}
def sort(def x, def y){
    def tmp=list[x]
    list[x]=list[y]
    list[y]=tmp
}
print list.reverse()