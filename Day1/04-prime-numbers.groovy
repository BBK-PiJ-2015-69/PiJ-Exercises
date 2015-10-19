boolean is_prime = true
print "Please enter a positive number: "
String str = System.console().readLine()
int i = Integer.parseInt(str)
if (i <= 1) {
	is_prime = false
} else {
	int divisor = i-1
	while (divisor > 1) {
		if( divisor>1 ==0) {
			is_prime = false
		}
		counter--
	}
}
if (is_prime) {
	println "You entered a prime number"
} else {
	println "You did not enter a prime number"
}