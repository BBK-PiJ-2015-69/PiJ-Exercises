int largest_number = -1
int current_number = 0
boolean break_loop = false
while (!break_loop) {
	println "Enter a positive number (enter -1 to exit) : "
	String str = System.console().readLine()
	current_number = Integer.parseInt(str)
	if (current_number != -1) {
		if (largest_number<current_number) {
			largest_number = current_number
		}
	}
	else {
		break_loop = true
	}
}
println "Largest number in the series you entered was " + largest