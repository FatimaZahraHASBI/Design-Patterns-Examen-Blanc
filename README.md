# Design-Patterns-Examen-Blanc
## 1.	Etablir un Diagramme de classe du modèle en appliquant les design patterns appropriés.<br>
Dans cet exercice j'ai travaillé avec les design pattern ssuivants :<br>
&ensp; - Composite : une figure peut être soit un rectangles ou un cercles ou un groupe de figures <br>
&ensp; - Observer : A chaque fois que l’état de l'objet paramètrage change, toutes les figures doivent être notifiées pour se mettre à jour. <br>
&ensp; - Strategy : Pour le traitement des dessins, on veut qu'au moment de l'exécution l’objet dessin peut changer d’algorithme avec un autre de la même famille et chaque algorithme peut évoluer indépendamment de la classe dessin qui les utilise <br><br><br>
![image](https://user-images.githubusercontent.com/63150702/198565486-31e50638-c26d-49b2-bab7-03379594fbfa.png)
<br><br>
## 2. Faire une implémentation du modèle en utilisant un projet Maven sans prendre en considération des aspects techniques.

&ensp;&ensp;&nbsp;L’initialisation du projet : <br><br>
![image](https://user-images.githubusercontent.com/63150702/198566163-a853ff89-19f2-4a34-a9fd-79ffa4610f9c.png)
<br><br>&ensp;&ensp;&nbsp;L’architecture du projet : <br><br>
![image](https://user-images.githubusercontent.com/63150702/198566197-6ba5443d-2a82-4ae2-bd25-870b991b9fe2.png)
<br><br>&ensp;&ensp;&nbsp;L'implémentation des classes : 
<br><br>
![image](https://user-images.githubusercontent.com/63150702/198574428-0064f8ae-1efc-4c8d-90e8-6ce8729cd021.png)
<br><br>
![image](https://user-images.githubusercontent.com/63150702/198574540-c042417a-1060-4ffc-af05-acdc90e2aaff.png)
<br><br>
![image](https://user-images.githubusercontent.com/63150702/198574832-cf1ca727-d0bb-40f0-bbf5-cf4509a250f9.png)
<br><br>
![image](https://user-images.githubusercontent.com/63150702/198574972-ddda7335-ff06-448e-99bb-e390650f1cab.png)
<br><br>
![image](https://user-images.githubusercontent.com/63150702/198575567-914471f6-87b9-4e3f-a354-ec88f3d86100.png)


## 3. Effectuer des Tests du modèle.
