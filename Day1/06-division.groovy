int num1, num2
int quotient = 0
int remainder = 0
int counter = 0
print "Please enter your first number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please enter your second number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
if(n1<n2){
	println "This program can not produce decimals";
} else {
	if (num1 < 1) {
		quotient = 0
		remainder = num2
	} else if (num2 < 1) {
		quotient = 0
		remainder = num1
	} else if(n1=n2){
		quotient = 1
		remainder = 0
	} else{
		while (num1>num2){
			quotient = quotient + 1
			num1 = num1 - num2
		}
		if(num1<num2){
			remainder = num1
		}
	}			 
	println "When " num1 + " is divided into " + num2 + " there is quotient " + quotient + ", with remainder " + remainder
}