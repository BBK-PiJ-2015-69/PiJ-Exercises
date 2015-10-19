int i = 2
while (i <= 1000) {
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
		println i
	} 
	i = i + 1
}