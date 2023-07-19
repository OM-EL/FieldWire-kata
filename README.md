# codeTest

# 

![Screenshot 2023-07-19 at 21 30 38](https://github.com/OM-EL/codeTest/assets/36996895/b340d3f4-7669-41d2-ade6-ca1acb8d462c)



# API Usage Guide

This document serves as a guide to interact with the different endpoint : `GET`, `POST`, `DELETE`, and `PATCH` using cURL on the command line.

## Project Controller API Usage

### Get All Projects

To fetch a list of all projects, use the `GET` method:

```
curl -X GET http://3.252.255.173:8080/api/v1/projects

```

### Get a Project by ID

To fetch a specific project by its UUID, use the `GET` method:

```
curl -X GET http://3.252.255.173:8080/api/v1/projects/id

```

Replace `id` with the actual UUID of the project.

### Create a Project

To create a new project, use the `POST` method:

```
curl -X POST -H "Content-Type: application/json" -d @/path/to/project.json http://3.252.255.173:8080/api/v1/projects

```

Replace `/path/to/project.json` with the path to the JSON file containing project data (example in the **DTOExample** Folder ).

the **@** should not be deleted .

**Example** : 

```
curl -X POST -H "Content-Type: application/json" -d @/Users/omarelhachimi/Desktop/Workplace/Fieldwire/DTOExample/projectCreation.json http://3.252.255.173:8080/api/v1/projects
```

### Delete a Project

To delete a project by its UUID, use the `DELETE` method:

```
curl -X DELETE http://3.252.255.173:8080/api/v1/projects/id

```

Replace `id` with the actual UUID of the project.

### Update a Project

To update an existing project, use the `PATCH` method:

```
curl -X PATCH -H "Content-Type: application/json" -d @/path/to/project.json http://3.252.255.173:8080/api/v1/projects/id

```

Replace `id` with the actual UUID of the project and `/path/to/project.json` with the path to the JSON file containing updated project data.

**NOTE:** Always replace the placeholders (`id`, `/path/to/project.json`, `/path/to/floorplan.json`, `/path/to/file.jpg`) with actual values when running these commands. Also, ensure that the JSON files contain valid and expected data before making `POST` or `PATCH` requests.

## Floorplan Controller API Usage

### Get All Floorplans

To fetch a list of all floorplans, use the `GET` method:

```
curl -X GET http://3.252.255.173:8080/api/v1/floorplans

```

### Get a Floorplan by ID

To fetch a specific floorplan by its UUID, use the `GET` method:

```
curl -X GET http://3.252.255.173:8080/api/v1/floorplans/id

```

Replace `id` with the actual UUID of the floorplan.

### Create a Floorplan

To create a new floorplan, use the `POST` method:

```
curl -X POST -H "Content-Type: multipart/form-data" -F "floorplan=@/path/to/floorplan.json;type=application/json" -F "file=@/path/to/file.jpg" http://3.252.255.173:8080/api/v1/floorplans

```

**Example**

```
curl -X POST -H "Content-Type: multipart/form-data" -F "floorplan=@/Users/omarelhachimi/Desktop/Workplace/Fieldwire/DTOExample/floorplanCreate.json;type=application/json" -F "file=@/Users/omarelhachimi/Desktop/Workplace/Fieldwire/DTOExample/floorplan1.jpg" http://3.252.255.173:8080/api/v1/floorplans

```

Replace `/path/to/floorplan.json` with the path to the JSON file containing floorplan data and `/path/to/file.jpg` with the path to the image file.

### Delete a Floorplan

To delete a floorplan by its UUID, use the `DELETE` method:

```
curl -X DELETE http://3.252.255.173:8080/api/v1/floorplans/id

```

Replace `id` with the actual UUID of the floorplan.

### Update a Floorplan

To update an existing floorplan, use the `PATCH` method:

```
curl -X PATCH -H "Content-Type: multipart/form-data" -F "floorplan=@/path/to/floorplan.json;type=application/json" -F "file=@/path/to/file.jpg" http://3.252.255.173:8080/api/v1/floorplans/id

```

**Example :** 

```
curl -X PATCH -H "Content-Type: multipart/form-data" -F "floorplan=@/Users/oma
relhachimi/Desktop/Workplace/Fieldwire/DTOExample/floorplanCreate.json;type=appl
ication/json" -F "file=@/Users/omarelhachimi/Desktop/Workplace/Fieldwire/DTOEx
ample/floorplan1.jpg" http://3.252.255.173:8080/api/v1/floorplans/dd9b5c76-
6a8a-4e79-b01f-ea75304fa428
```

Replace `id` with the actual UUID of the floorplan, `/path/to/floorplan.json` with the path to the JSON file containing updated floorplan data, and `/path/to/file.jpg` with the path to the updated image file.
