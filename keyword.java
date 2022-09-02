 public static void kEncode(String Eplaintext, String keyword)
		{
			//turn to uppercase
			String plaintext = Eplaintext.toUpperCase();
			keyword = keyword.toUpperCase();
			//make array of english alphabets
			char [] original = new char [26];
			for (int i = 0; i<26; i++)
			{
				original[i] = (char)(65 + i);
			}
			int kl = keyword.length();
			int pl = plaintext.length();
			char [] key = new char [26];
			int c = 0;
			//make array of alphabets after adding key 
			for (int i = 0; i<kl; i++)
			{
				key[c++] = keyword.charAt(i);
			}
			for (int i = 0; i < 26; i++) {
	            boolean z=false;
	            for (int a = 0; a < kl; a++) {
	                if (original[i] == key[a]) {
	                    z=true;
	                }   }
	            if (z == false) {
	                key[c++]=original[i];
	            }
	        }
			char [] ciphertext = new char [pl];
			// convert letters from original array to keyword array to get ciphertext
			for(int i =0, b=0; b<pl && i< pl;b++, i++)
			{
				for(int a = 0; a<26;a++)
				{
					if(plaintext.charAt(i) == original[a])
						ciphertext[b] = key[a];
				}
			}
			// turn array to string and print out
			String P = "";
			for (int i = 0; i<pl; i++)
			{
				char S = ciphertext[i];
				P = P + S;
			}
			P = P.toLowerCase();
			System.out.println(P);
			
		}
	public static void kDecode (String Eciphertext, String keyword)
		{
			//turn to uppercase
			 String ciphertext = Eciphertext.toUpperCase();
			keyword = keyword.toUpperCase();
			//make array of english alphabets
			char [] original = new char [26];
			for (int i = 0; i<26; i++)
			{
				original[i] = (char)(65 + i);
			}
			int kl = keyword.length();
			int cl = ciphertext.length();
			//make array of alphabets after adding key
			char [] key = new char [26];
			int c = 0;
			for (int i = 0; i<kl; i++)
			{
				key[c++] = keyword.charAt(i);
			}
			for (int i = 0; c< 26; i++) {
	            boolean z=false;
	            for (int a = 0; a < kl; a++) {
	                if (original[i] == key[a]) {
	                    z=true;
	                }   }
	            if (z == false) {
	                key[c++]=original[i];
	            }
	        }
			// convert letters from original array to keyword array to get plaintext
			char [] plaintext = new char [cl];
			for(int i =0, b=0; b<cl && i< cl;b++, i++)
			{
				for(int a = 0; a<26;a++)
				{
					if(ciphertext.charAt(i) == key[a])
						plaintext[b] = original[a];
						
				}
			}
			// turn array to string and print out
			String P = "";
			for (int i = 0; i<cl; i++)
			{
				char S = plaintext[i];
				P = P + S;
			}
			P = P.toLowerCase();
			System.out.println(P);
			
		}
