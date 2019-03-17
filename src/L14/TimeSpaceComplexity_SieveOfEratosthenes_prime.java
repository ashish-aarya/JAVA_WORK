package L14;

import java.util.*;

public class TimeSpaceComplexity_SieveOfEratosthenes_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SOE(25);
	}

	public static void SOE(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int table = 2; table <= n; table++) {
			if (prime[table] == false)
				continue;
			for (int mult = 2; mult * table <= n; mult++) {
				prime[table * mult] = false;
			}

		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i])
				System.out.println(i);
		}

	}

}
