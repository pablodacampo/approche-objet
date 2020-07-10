package recensement;

import java.util.Comparator;

		public class PlusPetiteVilleComparator implements Comparator<Ville> {

			@Override
			public int compare(Ville o1, Ville o2) {
				if (o1.getPopulation() > o2.getPopulation()) {
					return 1;
				} else if (o1.getPopulation() < o2.getPopulation()) {
					return -1;
				}
				return 0;
			}

		}
