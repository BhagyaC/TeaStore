# TeaStore #

The TeaStore is a micro-service reference and test application developed by the Descartes Research Group at the University of Würzburg. The TeaStore emulates a basic web store for automatically generated, tea and tea supplies. As it is primarily a test application, it features UI elements for database generation and service resetting in addition to the store itself. 

The TeaStore is a distributed micro-service application featuring five distinct services plus a registry. Each service may be replicated without limit and deployed on separate devices as desired. Services communicate using REST and using the Netflix "[Ribbon](https://github.com/Netflix/ribbon)" client side load balancer. Each service also comes in a pre-instrumented variant that uses [Kieker](http://kieker-monitoring.net) to provide detailed information about the TeaStore's actions and behavior.

The TeaStore is designed to be a reference / test application to be used in benchmarks and tests. Some of its envisioned use-cases are:
* Testing performance model extractors and predictors for distributed applications
* Testing micro-service and cloud management mechanisms, such as multi-tier auto-scalers
* Testing energy efficiency and power prediction and management mechanisms

Check out our **[wiki](https://github.com/DescartesResearch/TeaStore/wiki)** with information on how to [get started using/developing the TeaStore](https://github.com/DescartesResearch/TeaStore/wiki/Getting-Started), more information on the architecture and services of the Tea Store, guides on how to [run the TeaStore for benchmarking/testing](https://github.com/DescartesResearch/TeaStore/wiki/Testing-and-Benchmarking), and common [troubleshooting tips](https://github.com/DescartesResearch/TeaStore/wiki/Troubleshooting).

## Getting Started

To get started, we recommend running the TeaStore in an environment of your choice. We offer three ways of deploying and running the TeaStore:
* The easiest way: [Run TeaStore Container(s) using Docker](https://github.com/DescartesResearch/TeaStore/wiki/Getting-Started#run-pet-supply-store-containers-using-docker) (Recommended)
* [Deploy the TeaStore in one or several Java Application Container(s)](https://github.com/DescartesResearch/TeaStore/wiki/Getting-Started#deploy-the-pet-supply-store-in-java-application-containers)
* [Setup and run the TeaStore Development Environment](https://github.com/DescartesResearch/TeaStore/wiki/Getting-Started#setup-and-run-the-pet-supply-store-development-environment)
