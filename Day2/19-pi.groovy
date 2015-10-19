print "This program uses Leibniz formula for pi. Please enter a positive integer: "
String s = System.console().readLine()
int interations = 10000
int n = Integer.parseInt(s)
int i = 1
int is_plus = 0
double p = 0
double fraction = 0
while(i < interations){
	fraction = n / i
	if (p == 0) {
		p = fraction
	} else {
		if (is_plus == 0) {
			p = p - fraction
			is_plus = 1
		} else {
			p = p + fraction
			is_plus = 0
		}
	}
	println "After " + interations + " interations pi is " + p
	i = i + 2
}