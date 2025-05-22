![workflow](https://github.com/fx-world/euvd-api/actions/workflows/build.yml/badge.svg)

# EUVD API client libraries

This project provides an [OpenApi definition file](euvd-api.yaml) for the European Union Vulnerability Database API.
It is used to generate client libraries in a variety of programming languages.

[EUVD API Documentation](https://euvd.enisa.europa.eu/apidoc)

## Generate your own client / server

You can use the [openapi-generator](https://github.com/OpenAPITools/openapi-generator) to generate a client or server stub in the obscure programming language / framework you use.

e.g.

	docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/fx-world/euvd-api/refs/heads/main/euvd-api.yaml \
    -g go \
    -o /local/out/go

## Building instructions

download sources:
 
	git clone https://github.com/fx-world/euvd-api.git
	
generate client libraries with maven:
 
	mvn package
	
for Java go to java subfolder and call:

	mvn verify
	
