/*************************************************************************
 * tranSMART - translational medicine data mart
 *
 * Copyright 2008-2012 Janssen Research & Development, LLC.
 *
 * This product includes software developed at Janssen Research & Development, LLC.
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software  * Foundation, either version 3 of the License, or (at your option) any later version, along with the following terms:
 * 1.	You may convey a work based on this program in accordance with section 5, provided that you retain the above notices.
 * 2.	You may convey verbatim copies of this program code as you receive it, in any medium, provided that you retain the above notices.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS    * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 ******************************************************************/
package org.transmart.biomart

class BioAssayDataStatistics {
	BioAssayDataset dataset
	Experiment experiment
	BioAssayFeatureGroup featureGroup
	String featureGroupName
	Double maxValue
	Double meanValue
	Double minValue
	Double quartile1
	Double quartile2
	Double quartile3
	BioSample sample
	Long sampleCount
	Double stdDevValue
	String valueNormalizeMethod

	static mapping = {
		table 'BIO_ASSAY_DATA_STATS'
		id generator: 'sequence', params: [sequence: 'SEQ_BIO_DATA_FACT_ID'], column: 'BIO_ASSAY_DATA_STATS_ID'
		version false

		dataset column: 'BIO_ASSAY_DATASET_ID'
		experiment column: 'BIO_EXPERIMENT_ID'
		featureGroup column: 'BIO_ASSAY_FEATURE_GROUP_ID'
		quartile1 column: 'QUARTILE_1'
		quartile2 column: 'QUARTILE_2'
		quartile3 column: 'QUARTILE_3'
		sample column: 'BIO_SAMPLE_ID'
		sampleCount column: 'BIO_SAMPLE_COUNT'
	}
}
