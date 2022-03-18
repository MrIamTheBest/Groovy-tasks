package s23456

def finder = new FileNameFinder()
def files = finder.getFileNames 'path', '**/*.html'
print files

