object Tutorial6 extends App{

	//Define Alphabet
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	//Text will be shift by this much
	//shift = (# + 26) % 26 <-- This allows us to take any number (even if it is negative, or bigger than our alphabet size) 
	val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	//The code we want to encrypt/decrypt
	val inputText = scala.io.StdIn.readLine("Secret Message: ")

	//Lets Encrypt/Decrypt the code
	val outputText = inputText.map( (c: Char) => { 

		//Finding the c char in our alphabet
		val x = alphabet.indexOf(c.toUpper)

		//c char is not in our alphabet -> leave it be
		if (x == -1){
			c
		}

		//c char is in our alphabet -> encrypt it
		else{
			alphabet((x + shift) % alphabet.size)
		} 
	});

	//Print the result
	println(outputText);
}    