import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Flooring {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];

		int queries = sc.nextInt();

		int i = 0;
		int n[] = new int[2];

		while (i < size) {
			array[i] = sc.nextInt();
			i++;
		}
		i = 0;
		int j = 0;
		while (i < queries) {
			while (true) {
				n[j++] = sc.nextInt();
				n[j] = sc.nextInt();
				j = 0;
				break;
			}
			float average = (n[0] + n[1]) / 2;
			System.out.print((int) (Math.floor(average)));
		}
	}
}

/*
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
 
*//**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *//*
public class Main {
    public static void main(String[] args)throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PlayWithNumbers solver = new PlayWithNumbers();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class PlayWithNumbers {
        public void solve(int testNumber, Reader in, PrintWriter out) throws Exception {
            int n = in.nextInt();
            int q = in.nextInt();
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; ++i) {
                a[i] += a[i - 1];
                a[i] += in.nextLong();
            }
            for (int i = 0; i < q; ++i) {
                int l = in.nextInt();
                int r = in.nextInt();
                long mean = (long) Math.floor((a[r] - a[l - 1]) / (r - l + 1));
                out.println(mean);
            }
        }
 
    }
 
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;
 
        public Reader(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg) {
                return -ret;
            }
            return ret;
        }
 
        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg) {
                return -ret;
            }
            return ret;
        }
 
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }
 
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
 
    }
}
 */
