import java.util.*;
public class isMirror {
	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[arr[i]] != i)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
        int o[]  = { 3,4,2,0,1 };
		if (isMirrorInverse(o))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

