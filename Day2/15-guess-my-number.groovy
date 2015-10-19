int random_number = Math.abs(1000 * Math.random())
println "I chose a random number between 0 and 1000. Try to number_guessed my number! "
String s = System.console().readLine()
int number_guessed = Integer.parseInt(s)
int count = 1
while (number_guessed != random_number) {
	if (number_guessed > random_number) {
		println "No! My number is lower."
	} else {
		println "No! My number is higher."
	}
	count = count + 1
	print "Tell me a number: "
	s = System.console().readLine()
	number_guessed = Integer.parseInt(s)
}
println "CORRECT"
println "You neededed " + count + " guesses."