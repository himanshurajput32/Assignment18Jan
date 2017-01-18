
//Tiffin service payment method
object PaymentMethod extends App{

def paymentMode(amount:Int,way:String):Double={
way match{
case "paytm" | "freecharge" => amount+amount/50
case "netbanking" =>amount+5.0
case "card" =>amount+1.5
case "cash" =>amount
}
}
//calling function with static inputs
println(paymentMode(100,"freecharge"))

}
