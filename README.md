##  API oversigt

Følge metoder benyttes til at udføre CRUD APIs.

### Cykelryttere

| Method | Url                                   | Beskrivelse                     |
|--------|---------------------------------------|---------------------------------|
| GET    | /cykelrytter                          | Hent all cykelryttere           |
| GET    | /cykelrytter/{cykelrytterId}          | Hent cykelrytter ud fra id      |
| GET    | /cykelrytter/hold/{cykelhold}         | Hent cykelrytter ud fra hold id |
| GET    | /cykelrytter/orden                    | Hent cykelryttere i rækkefølge  |
| POST   | /{teamId}/cykelrytter                 | Opret en cykelrytter            |
| PUT    | /{teamId}/cykelrytter/{cykelrytterId} | Edit a product by product Id    |
| DELETE | /cykelrytter/{cykelrytterId}          | Slet en cykelrytter ud fra Id   |

### Cykelhold

| Method | Url                                   | Beskrivelse                     |
|--------|---------------------------------------|---------------------------------|
| GET    | /cykelhold                            | Hent alle cykelhold             |                                                                      
| GET    | /cykelhold/{teamid}                   | hent cykelhold ud fra teamId    |                                              
|        |                                                                         |
