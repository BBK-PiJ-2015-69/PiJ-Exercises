int order1, order2, order3
print "Please type in your first number: "
String str = System.console().readLine()
int i = Integer.parseInt(str)
print "Please type in your second number: "
str = System.console().readLine()
int j = Integer.parseInt(str)
print "Please type in your third number: "
str = System.console().readLine()
int k = Integer.parseInt(str)
if (i <= j && i <= k) {
	order1 = i
	if(j < k){
		order2 = j
		order3 = k
	} else {
		order2 = k
		order3 = j
	}
} else if (j <= i && j <= k) {
	order1 = j
	if (i < k) {
		order2 = i
		order3 = k
	} else {
		order2 = k
		order3 = i
	}
} else {
	order1 = k
	if(i < j){
		order2 = i
		order3 = j
	} else {
		order2 = j
		order3 = i
	}
}
println "Sorted Numners: " + order1 + ", " + order2 + ", " + order3 + " (Ascending Order)"