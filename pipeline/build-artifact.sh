#!/usr/bin/env bash
set -e

cd git-repo
mvn package
cp target/*.jar ../artifact-dir/
