/*
 * The MIT License
 *
 * Copyright 2016 Andrew Simmons
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.agsimmons.jtictactoe;

import com.github.agsimmons.jtictactoe.client.Client;
import com.github.agsimmons.jtictactoe.server.Server;

public class jTicTacToe {

    public static void main(String[] args) {
        if (args.length >= 1) {
            // Parse first argument
            switch (args[0]) {
                case "-c": // Client
                    createClient();
                    break;
                case "-s": // Server
                    createServer();
                    break;
                default:
                    displayProgramInfo();
                    break;
            }
        } else {
            displayProgramInfo();
        }
    }

    private static void createClient() {
        Client client = new Client();
    }

    private static void createServer() {
        Server server = new Server();
    }

    private static void displayProgramInfo() {
        System.out.println("Usage: wordpiles {-c|-s}");
        System.out.println("");
        System.out.println(" -c");
        System.out.println("   Run program as client");
        System.out.println(" -s");
        System.out.println("   Run program as server");
    }
}
