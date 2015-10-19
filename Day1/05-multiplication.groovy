int num1, num2
int product = 0
int counter = 0
print "Please enter your first number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please enter your second number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
if (num1 < 1 || num2 < 1) {
	product = 0
}else{
	while (counter<num1){
		product = product + num2
		counter++
	}
}
println "The product of your two numbers would be: " + product