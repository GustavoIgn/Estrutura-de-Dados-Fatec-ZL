package br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class Arvore {

    No raiz;

    public Arvore() {
        raiz = null;
    }

    private void insert(No no, No raizSubArvore) {
        if (raiz == null) {
            raiz = no;
        } else {
            if (no.dado < raizSubArvore.dado) {
                if (raizSubArvore.esquerda == null) {
                    raizSubArvore.esquerda = no;
                } else {
                    insert(no, raizSubArvore.esquerda);
                }
            }
            if (no.dado >= raizSubArvore.dado) {
                if (raizSubArvore.direita == null) {
                    raizSubArvore.direita = no;
                } else {
                    insert(no, raizSubArvore.direita);
                }
            }
        }

    }

    public void insertLeaf(int dado) {
        No no = new No();
        no.dado = dado;
        no.esquerda = null;
        no.direita = null;
        insert(no, raiz);
    }

    private void prefix(No raizSubArvore) throws Exception {
        if (raiz == null) {
            throw new Exception("Arvore Vazia");
        } else {
            System.out.print(raizSubArvore.dado);
            System.out.print(" ");
            if (raizSubArvore.esquerda != null) {
                prefix(raizSubArvore.esquerda);
            }
            if (raizSubArvore.direita != null) {
                prefix(raizSubArvore.direita);
            }
        }
    }

    private void infix(No raizSubArvore) throws Exception {
        if (raiz == null) {
            throw new Exception("Arvore Vazia");
        } else {
            if (raizSubArvore.esquerda != null) {
                infix(raizSubArvore.esquerda);
            }
            System.out.print(raizSubArvore.dado);
            System.out.print(" ");
            if (raizSubArvore.direita != null) {
                infix(raizSubArvore.direita);
            }
        }
    }

    private void postfix(No raizSubArvore) throws Exception {
        if (raiz == null) {
            throw new Exception("Arvore Vazia");
        } else {
            if (raizSubArvore.esquerda != null) {
                postfix(raizSubArvore.esquerda);
            }
            if (raizSubArvore.direita != null) {
                postfix(raizSubArvore.direita);
            }
            System.out.print(raizSubArvore.dado);
            System.out.print(" ");
        }
    }

    public void prefixSearch() throws Exception {
        prefix(raiz);
    }

    public void infixSearch() throws Exception {
        infix(raiz);
    }

    public void postfixSearch() throws Exception {
        postfix(raiz);
    }

    private No nodeSearch(No raizSubArvore, int valor) throws Exception {
        if (raizSubArvore == null) {
            throw new Exception("Arvore Vazia");
        } else if (valor < raizSubArvore.dado) {
            return nodeSearch(raizSubArvore.esquerda, valor);
        } else if (valor > raizSubArvore.dado) {
            return nodeSearch(raizSubArvore.direita, valor);
        } else {
            return raizSubArvore;
        }
    }

    private int nodeLevel(No raizSubArvore, int valor) throws Exception {
        if (raizSubArvore == null) {
            throw new Exception("Arvore Vazia");
        } else if (valor < raizSubArvore.dado) {
            return 1 + nodeLevel(raizSubArvore.esquerda, valor);
        } else if (valor > raizSubArvore.dado) {
            return 1 + nodeLevel(raizSubArvore.direita, valor);
        } else {
            return 0;
        }
    }

    public void search(int valor) {
        try {
            No no = nodeSearch(raiz, valor);
            int level = nodeLevel(raiz, valor);
            System.out.println("Dado: " + no.dado + " no Nível: " + level);
        } catch (Exception e) {
            System.err.println("Dado não Encontrado");
        }
    }

    private void removeChild(No raizSubArvore, int valor) throws Exception {
        No no = nodeSearch(raizSubArvore, valor);
        if (no != null) {
            No pai = nodeParent(null, raiz, no.dado);
            if (no.esquerda != null && no.direita != null) {
                No noTroca = no.esquerda;
                while (noTroca.direita != null) {
                    noTroca = noTroca.direita;
                }
                pai = nodeParent(null, raiz, noTroca.dado);
                no.dado = noTroca.dado;
                noTroca.dado = valor;
                removeOneOrZeroLeaf(pai, noTroca);
            } else {
                removeOneOrZeroLeaf(pai, no);
            }
        } else {
            throw new Exception("Valor Inexistente");
        }

    }

    private No nodeParent(No parent, No raizSubArvore, int valor) throws Exception {
        if (raiz == null) {
            throw new Exception("Arvore Vazia");
        } else if (valor < raizSubArvore.dado) {
            return nodeParent(raizSubArvore, raizSubArvore.esquerda, valor);
        } else if (valor > raizSubArvore.dado) {
            return nodeParent(raizSubArvore, raizSubArvore.direita, valor);
        } else {
            if (parent == null) {
                return raiz;
            } else {
                return parent;
            }
        }
    }

    private void removeOneOrZeroLeaf(No pai, No no) {
        if (no.esquerda == null && no.direita == null) {
            change(pai, no, null);
        } else if (no.esquerda == null) {
            change(pai, no, no.direita);
        } else if (no.direita == null) {
            change(pai, no, no.esquerda);
        }
    }

    private void change(No pai, No no, No novoNo) {
        if (pai.esquerda != null && pai.esquerda.dado == no.dado) {
            pai.esquerda = novoNo;
        } else if (pai.direita.dado == no.dado) {
            pai.direita = novoNo;
        }
    }

    public void remove(int valor) throws Exception {
        try {
            removeChild(raiz, valor);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}

