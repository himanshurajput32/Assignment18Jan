

object ListImplementation extends App{
val list=List(10,2,3,4,5,6,7,8,9,10)
val list1=List(0,0,0,0,0,0,0,0,0,0)

//Method to print table of elements in table
def printTable(list:List[Int]):Unit={
for(i<-1 to 10){
for(ls<-list){
print(ls*i+" ")
}
println("")
}
}

/*def listAggregate(list_one:List[Int],list_two:List[Int])={
var finallist:List[(Int,Int)]=List()
for(i<- 1 to list_one.length){
val temp1=list_one(i)
val temp2=list_two(i)
//var list_temp:List[Int]=List() 
//list_temp=List(temp1,temp2)
//finallist=finallist :+ list_temp
 (temp1,temp2) :: finallist
}
println(finallist)

}
*/ 

//Method to find prime in list
def primeInList(list:List[Int])={
for(ls<-list){
var f=1
for(i<- 2 to ls/2){
if(ls%i==0){
f=0
}
}
if(f==1){
print(ls+" ")
}
}

}

//Method to find sum of lists
def listSum(list:List[Int]):Int={
var sum=0
for(ls<-list){
sum=sum+ls
}
sum
}

//method to find multiplication in list
def listMul(list:List[Int]):Int={
var mul=1
for(ls<-list){
mul=mul*ls
}
mul
}

//method to find last element of list and its index 
def lastElement(list:List[Int]):Unit={
var pos=0
var element=list(0)
for(ls<-list){
element=ls
pos +=1
}
println(s"$element is last element at $pos position")
}


listAggregate(list,list1)
lastElement(list)
println(listSum(list))
println(listMul(list))
printTable(list)
primeInList(list)
}
