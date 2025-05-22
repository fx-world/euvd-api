![workflow](https://github.com/fx-world/euvd-api/actions/workflows/build.yml/badge.svg)

# EUVD API client libraries

This project provides an [OpenApi definition file](euvd-api.yaml) for the European Union Vulnerability Database API.
It is used to generate client libraries in a variety of programming languages.

* [EUVD API Documentation](https://euvd.enisa.europa.eu/apidoc) (original)
* [Swagger UI](https://fx-world.github.io/euvd-api/) (interactive)

## Generate your own client / server

You can use the [openapi-generator](https://github.com/OpenAPITools/openapi-generator) to generate a client or server stub in the obscure programming language / framework you use.

e.g.

	docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/fx-world/euvd-api/refs/heads/main/euvd-api.yaml \
    -g go \
    -o /local/out/go

## Building instructions

	# download sources: 
	git clone https://github.com/fx-world/euvd-api.git
	# generate client libraries with maven: 
	mvn package
	# for Java go to java subfolder 
	cd java
	# and call:
	mvn verify
	
## Contributing

Issues and pull requests are welcome. Please open an issue if you find a bug or have a feature request.

## License

Copyright (c) 2024 Pascal Weyprecht

This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/

SPDX-License-Identifier: EPL-2.0