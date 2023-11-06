#CSIS 294 Project 1 - Griffin Blockchain

This repository contains my implementation of the CSIS 294 Project 1, "Basic Griffin Blockchain." This project involves creating a Blockchain miner with various functionalities, including receiving transactions, managing a Merkle Tree, and using the Proof of Work algorithm.

##Project Overview

In this project, I have developed a Blockchain miner that can perform the following tasks:

Receive transactions from users or remote nodes.
Send transactions to a remote node.
Manage incoming remote node messages using a Queue.
Generate a Merkle Tree and compute the Merkle Root as part of transaction processing.
Create Blockchain Blocks using the Proof of Work algorithm.
I have added code to the existing code base called "BlockchainBasics," which is provided in this repository. The "BlockchainBasics" code allows running two instances of the application on different ports, enabling the exchange of transactions and mining blocks.


##Technologies and Concepts

Socket programming
Queue
Multithreading
Hashing: SHA-256
Merkle Trees
Blockchain Proof of Work

To run this project on your local machine, follow these steps:

Download or clone this repository to your computer.
Open the project in your favorite Java IDE.

##Testing

You can test the project in two ways:

Approach 1:
Run the project in your IDE without connecting to another miner when prompted.

Approach 2 (for running two instances):

Generate a JAR file for the project.
Run one instance of the app from your IDE.
Run the second instance from a command line tool with a different port.
Contributions

This project is a part of an academic assignment, and contributions are not expected. However, if you have suggestions or improvements to the project, please feel free to create an issue or a pull request.
