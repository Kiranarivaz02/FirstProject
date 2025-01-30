/*Develop a function that processes a stream of log data from Aws Cloud watch, represented as  

 * a 2D array of strings called logs. Each inner list logs contains logs info , including the year, date , status, and message.
 * ..
 * 
 * functional description:
 * COmplete the function extracterrorLogs in the editor below.
 * extractErrorLogs has the following parameters
 * string logs[n][4]: undefined , unsorted log information
 * 
 * returs:
 * string[][4] the filtered error log 
 * 
 * size of log: 1 to 10^5 
 * day: 1 to 31
 * month : 1 to 12
 * year: 2000 to 3000
 * hour: 00 to 23
 * minutes: 00 to 59
 * 
 * 
 * Input (stdin)
3
4
01-01-2022 18:00 CRITICAL failed 
01-01-2023 15:00 ERROR failed 
01-01-2023 16:00 SUCCESS established

Your Output (stdout)
01-01-2023 15:00 ERROR failed

if there is no logs with error or critical status hence the answer is []

Expected Output
01-01-2022 18:00 CRITICAL failed
01-01-2023 15:00 ERROR failed



Input (stdin)

Run as Custom Input
|
Download
5
4
20-01-2244 08:06 CRITICAL failed 
11-08-2174 16:08 SUCCESS established 
26-11-2413 19:47 SUCCESS established 
16-10-2145 08:56 ERROR failed 
21-07-2400 21:23 ERROR failed 
Your Output (stdout)
20-01-2244 08:06 CRITICAL failed
16-10-2145 08:56 ERROR failed
21-07-2400 21:23 ERROR failed
Expected Output

Download
16-10-2145 08:56 ERROR failed
20-01-2244 08:06 CRITICAL failed
21-07-2400 21:23 ERROR failed

explanation:
	logs[0] and logs[2] contain ERROR or CRITICAL status and logs[2] has the earlier time of arrival
*/
package com.Mock2;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;


	import java.time.format.DateTimeFormatter;
	import java.time.LocalDateTime;
	class Result {

	    /*
	     * Complete the 'extractErrorLogs' function below.
	     *
	     * The function is expected to return a 2D_STRING_ARRAY.
	     * The function accepts 2D_STRING_ARRAY logs as parameter.
	     */

	    public static List<List<String>> extractErrorLogs(List<List<String>> logs) {
	    // Write your code here
	    List<List<String>> errorLogs=new ArrayList<>();
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	    for(List<String> log : logs){
	        if(log.get(2).equals("ERROR") || log.get(2).equals("CRITICAL")){
	            errorLogs.add(log);
	        }
	    }
	    errorLogs.sort((log1, log2) -> {
	            LocalDateTime dateTime1 = LocalDateTime.parse(log1.get(0) + " " + log1.get(1), formatter);
	            LocalDateTime dateTime2 = LocalDateTime.parse(log2.get(0) + " " + log2.get(1), formatter);
	            return dateTime1.compareTo(dateTime2);
	        });
	    return errorLogs;
	        
	    }
	}

	public class Test {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int logsRows = Integer.parseInt(bufferedReader.readLine().trim());
	        int logsColumns = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<String>> logs = new ArrayList<>();

	        IntStream.range(0, logsRows).forEach(i -> {
	            try {
	                logs.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .collect(toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        List<List<String>> result = Result.extractErrorLogs(logs);

	        result.stream()
	            .map(
	                r -> r.stream()
	                    .collect(joining(" "))
	            )
	            .map(r -> r + "\n")
	            .collect(toList())
	            .forEach(e -> {
	                try {
	                    bufferedWriter.write(e);
	                } catch (IOException ex) {
	                    throw new RuntimeException(ex);
	                }
	            });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
