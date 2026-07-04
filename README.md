Here's a concise and professional README suitable for your Harness lab project.

---

# Harness CI/CD Implementation Lab

## Overview

This project demonstrates an end-to-end CI/CD pipeline using Harness to build, containerize, and deploy a Java Maven application to a Google Kubernetes Engine (GKE) cluster.

## Tech Stack

* Harness CI/CD
* GitHub
* Java (Maven)
* Docker
* Google Artifact Registry
* Google Kubernetes Engine (GKE)
* Kubernetes

## CI/CD Workflow

```text
GitHub (develop)
        │
        ▼
 Harness Git Trigger
        │
        ▼
     CI Pipeline
   • Checkout Code
   • Maven Build
   • Build Docker Image
   • Push to Artifact Registry
        │
        ▼
     CD Pipeline
   • Deploy to Dev
   • Deploy to Stage
        │
        ▼
 Google Kubernetes Engine
```

## Features

* Automated CI pipeline triggered by commits to the `develop` branch
* Builds Java application using Maven
* Creates and pushes Docker image to Google Artifact Registry
* Deploys application to **Dev** and **Stage** Kubernetes namespaces
* Uses Harness for end-to-end CI/CD automation

## Validation

Verify the deployment using:

```bash
kubectl get pods -n dev
kubectl get pods -n stage

kubectl get svc -n dev
kubectl get svc -n stage
```

Then access the application's LoadBalancer URL. A successful deployment displays:

```text
Hello from Harness Lab
```

## Outcome

This project showcases a complete CI/CD implementation using Harness, automating the build, containerization, and deployment of a Java application to Kubernetes. It demonstrates Git-triggered automation, multi-environment deployments, and deployment validation on GKE.

Add 1 Add 2 Add 3 Add 4 Add 5 Add 6
