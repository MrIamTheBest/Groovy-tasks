package s23456

def list=[3, 5, 67, 87, 34]
def letters =["b", "b", "c", "a", "c"]

def prin = { l->println "$l"}
prin.call(list)
def max = { l->
   a=l.max()
    println "$a"
}
max.call(list)
def sor ={l-> println(l.sort())}
sor.call(letters)