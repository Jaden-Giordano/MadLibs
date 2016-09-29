# Each MadLib file begins with filling in the parts of speech, so at the beginning list out each part of speech to be queried on a new line
# For example
Adjective
Noun
# All the parts of speech are available are: Noun, PluralNoun, Adjective, Verb, Number, Place, Relative, PersonInRoom, BodyPart, VerbEndingInING, VerbEndingInED, and Adverb.
# Then to indicate to the parser, that the list of parts of speech has been complete and the story is ready to begin put '**STORY**' on a new line, like this
**STORY**
# Then write the story and where ever each part of speech should be filled in, place a '%s'.
# For example
The %s %s was cool.
# Also to make a comment that the parser will ignore add a '#' to the beginning to the line.
# You can run this file by selecting the second option in the selection menu and inputting the absolute path to the file, including the filename.
