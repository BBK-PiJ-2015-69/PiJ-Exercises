boolean number_consecutive = true
boolean break_loop = false
int last_number = 0
int current_number = 0
while (!break_loop) {
	println "Enter a positive number, so as to test if consecutively increasing upwards (enter -1 to exit) : "
	String str = System.console().readLine()
	current_number = Integer.parseInt(str)
	if (current_number != -1) {
		if (((last_number - current_number)!=1)||((current_number - last_number)!=1)) {
			if(number_consecutive != false){
				number_consecutive = true
			}
		} else {
			number_consecutive = false
		}
		last_number = current_number
	}
	else {
		break_loop = true
	}
}
if (!number_consecutive) {
	println "No"
} else {
	println "Yes"
}