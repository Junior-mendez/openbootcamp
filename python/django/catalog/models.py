import uuid
from django.db import models
from django.urls import reverse
# Create your models here.

class Genre(models.Model):
    name = models.CharField(max_length=64, help_text="Pon el nombre del género")

    def __str__(self) -> str:
        return self.name

class Book (models.Model):
    title = models.CharField(max_length=32)
    author =  models.ForeignKey('Author', on_delete=models.SET_NULL, null=True)
    summary = models.TextField(max_length=100, help_text="Escribe aquí de que va el libro")
    isbn =  models.CharField('ISBN',max_length=13, help_text="El isbn es de 13 caracteres")
    genre =  models.ManyToManyField(Genre)

    def __str__(self) -> str:
        return self.title

    def get_absolute_url(self):
        return reverse('book-detail', args=[str(self.id)])

class BookInstance(models.Model):
    id= models.UUIDField(primary_key=True,default=uuid.uuid4, help_text="ID único para este libro")
    book = models.ForeignKey('Book',on_delete=models.SET_NULL, null=True)
    imprint = models.CharField(max_length=200)
    due_black = models.DateField(null=True,blank=True)

    LONG_STATUS =(
        ('m', 'Maintenance'),
        ('o','On loan'),
        ('a','Available'),
        ('r','Reserved'),
    )
    status = models.CharField(max_length=1,choices=LONG_STATUS,blank=True,default=True,help_text="Disponibilidad de libro")


class Author(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    date_of_birth = models.DateField(null=True,blank=True)
    date_of_death = models.DateField('Died',null=True,blank=True)

    def get_absolute_url(self):
        return reverse('author-detail',args=[str(self.id)])

    def __str__(self) -> str:
        return f'{self.last_name} {self.first_name}'
    
class Director(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    date_of_birth = models.DateField(null=True,blank=True)
    date_of_death = models.DateField('Died',null=True,blank=True)

    def get_absolute_url(self):
        return reverse('director-detail',args=[str(self.id)])

    def __str__(self) -> str:
        return f'{self.last_name} {self.first_name}'

class Movie (models.Model):
    title = models.CharField(max_length=32)
    director =  models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)
   

    def __str__(self) -> str:
        return self.title

    def get_absolute_url(self):
        return reverse('movie-detail', args=[str(self.id)])

