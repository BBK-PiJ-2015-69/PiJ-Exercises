print "Please type in a positive integer to find the closest prime number: "
print "Please type in a positive integer to find the closest prime number: "
String s = System.console().readLine()
int the_number = Integer.parseInt(s)
boolean prime_number = false
int	local_primes = 0
int	lower_prime = 0
int	higher_prime = 0
int i = 2
int counter = 0
while (local_primes < 2) {
	boolean prime_number = true
	int counter = 2;
	while (counter < (i-1)) {
		int j = i % counter
		if (j == 0) {
			prime_number = false
		} 
		counter = counter + 1
	} 
	if (prime_number) {
		current_prime = i 
		if (i <= the_number){
			lower_prime = current_prime
			local_primes = local_primes + 1
		}else{
			higher_prime = current_prime
			local_primes = local_primes + 1
		}
	i = i + 1
}
distance1 = the number - higher_prime
distance2 = higher_prime - the number
if (distance1 == distance2){
	println "Two primes equal distance " + lower_prime + " and " + higher_prime
}elseif(distance1 > distance1){
	println "Nearest prime is " + higher_prime
}else{
	println "Nearest prime is " + lower_prime
}