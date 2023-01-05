from django.shortcuts import render

# Create your views here.

from .models import Book,Author,Genre,BookInstance,Movie,Director

def index(request):
    num_books=Book.objects.all().count()
    num_authors = Author.objects.all().count()
    num_instances = BookInstance.objects.all().count()
    disponibles = BookInstance.objects.filter(status__exact='a').count()

    return render(
        request,
        'index.html',
        context={
            'num_books':num_books,
            'num_authors':num_authors,
            'disponibles':disponibles,
            'num_instances':num_instances
        }
    )

def peliculas(request):
    num_movies=Movie.objects.all().count()
    num_directors = Director.objects.all().count()

    return render(
        request,
        'peliculas.html',
        context={
            'num_movies':num_movies,
            'num_directors':num_directors
        }
    )