package com.resources;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * InputReader class is responsible for reading user input from the console.
 */
public class InputReader
 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Reads a line of input from the user.
     *
     * @return the input string entered by the user, or null if an IOException occurs.
     */
    public String reader()
	{
        try
		{
            return reader.readLine();
        }
		catch (IOException e) 
		{
            System.out.println("IOException occurred");
            e.printStackTrace();
            return null;
        }
    }
}
