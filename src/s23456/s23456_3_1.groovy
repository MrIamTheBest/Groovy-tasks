package s23456

def list1=['a','b','c']
def list2=[1,8,23]
def list11=[]
def list12=[]

list1.each{
    println it
}
list2.each{
    println it
}
list1.each{
    list11.add(it)
    list11.add(it)
}
println list11
list2.each{
    list12.add(it)
    list12.add(it)
}
println list12